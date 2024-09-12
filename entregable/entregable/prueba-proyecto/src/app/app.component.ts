import { Component } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import {Pregunta1Component} from './pregunta1/pregunta1.component';
import { Pregunta2Component } from './pregunta2/pregunta2.component';

@Component({
  selector: 'app-root',
  standalone: true,
  imports: [RouterOutlet, Pregunta1Component, Pregunta2Component],
  templateUrl: './app.component.html',
  styleUrl: './app.component.scss'
})
export class AppComponent {
  title = 'prueba-proyecto';
}
