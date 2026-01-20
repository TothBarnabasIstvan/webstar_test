import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {DurationSaveDTO} from '../core/model/durationSaveDTO';
import {Observable} from 'rxjs';
import {DurationDTO} from '../core/model/durationDTO';

@Injectable({
  providedIn: 'root',
})
export class DurationService {

  private baseUrl = 'http://localhost:8083/api/duration';

  constructor(private http: HttpClient) {
  }

  addDuration(dto: DurationSaveDTO): Observable<DurationDTO> {
    return this.http.post<DurationDTO>(this.baseUrl, dto);
  }

  getAllDurations(): Observable<DurationDTO[]> {
    return this.http.get<DurationDTO[]>(this.baseUrl);
  }

}
