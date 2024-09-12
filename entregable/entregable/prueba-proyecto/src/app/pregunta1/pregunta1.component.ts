import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-pregunta1',
  standalone: true,
  imports: [],
  templateUrl: './pregunta1.component.html',
  styleUrl: './pregunta1.component.scss'
})

export class Pregunta1Component implements OnInit {
  respuestasUsuario: { entorno?: string } = {};

  constructor() { }
// 
ngOnInit(): void {
  // Verificar si localStorage está disponible
  if (typeof localStorage !== 'undefined') {
    // Guardar el valor 'x' en el localStorage con la clave 'nombre'
    const nombre = 'x';
    localStorage.setItem('nombre', nombre);
  } else {
    console.error('localStorage no está disponible en este entorno.');
  }
}


  text (){
    // Añadir el event listener al botón una vez que el componente se ha inicializado
    const btn = document.getElementById('preg1-btn');
    if (btn) {
      btn.addEventListener('click', this.pregEntorno.bind(this));
    }
  }
  pregEntorno(): void {
    const entornos = document.getElementsByName("tipo-entorno") as NodeListOf<HTMLInputElement>;

    // Convertir NodeListOf a Array para que sea iterable
    const entornosArray = Array.from(entornos);

    // Variable para almacenar el valor seleccionado
    let seleccionadoEntorno: string | null = null;

    // Recorrer todos los radio buttons para encontrar el seleccionado (checked)
    for (const entorno of entornosArray) {
      if (entorno.checked) {
        seleccionadoEntorno = entorno.value;
        break;
      }
    }

    this.respuestasUsuario = {
      entorno: seleccionadoEntorno ?? undefined,
    };

    // Mostrar el valor seleccionado
    if (seleccionadoEntorno) {
      console.log(`Respuesta seleccionada: ${seleccionadoEntorno}`);
      console.log(this.respuestasUsuario);
    } else {
      alert("No ha seleccionado una opción");
    }
  }
}