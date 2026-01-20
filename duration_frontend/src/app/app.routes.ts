import { Routes } from '@angular/router';
import {DurationFormComponent} from './components/duration-form/duration-form.component';

export const routes: Routes = [
  { path: 'duration', component: DurationFormComponent},
  { path: '', redirectTo: 'duration', pathMatch: 'full' }
];
