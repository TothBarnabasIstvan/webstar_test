import {Component, signal} from '@angular/core';
import {DurationService} from '../../services/duration.service';
import {DurationSaveDTO} from '../../core/model/durationSaveDTO';
import {DurationDTO} from '../../core/model/durationDTO';
import {FormsModule} from '@angular/forms';
import {CommonModule} from '@angular/common';
import {HttpClientModule} from '@angular/common/http';

@Component({
  selector: 'app-duration-form',
  standalone: true,
  imports: [CommonModule, FormsModule, HttpClientModule],
  templateUrl: './duration-form.component.html',
  styleUrl: './duration-form.component.css',
})
export class DurationFormComponent {

  seconds: number = 0;
  result = signal('');

  constructor(private durationService: DurationService) {}

  submit() {
    const dto: DurationSaveDTO = { seconds: this.seconds };
    console.log('Submitting:', dto.seconds);
    this.durationService.addDuration(dto).subscribe({
      next: (res: DurationDTO) => {
        console.log('Response:', res);
        this.result.set(res.result);
        console.log('Updated result:', this.result);
      },
      error: err => console.error(err)
    });
  }
}
