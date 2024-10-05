import { Component } from '@angular/core';

@Component({
  selector: 'app-inicio',
  standalone: true,
  imports: [],
  templateUrl: './inicio.component.html',
  styleUrl: './inicio.component.scss'
})
export class InicioComponent {
  contadorNum = 0;

  incrementar(){
    this.contadorNum = this.contadorNum+1;
  }


  }



