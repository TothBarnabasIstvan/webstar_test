import { ComponentFixture, TestBed } from '@angular/core/testing';

import { DurationFormComponent } from './duration-form.component';

describe('DurationForm', () => {
  let component: DurationFormComponent;
  let fixture: ComponentFixture<DurationFormComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [DurationFormComponent]
    })
    .compileComponents();

    fixture = TestBed.createComponent(DurationFormComponent);
    component = fixture.componentInstance;
    await fixture.whenStable();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
