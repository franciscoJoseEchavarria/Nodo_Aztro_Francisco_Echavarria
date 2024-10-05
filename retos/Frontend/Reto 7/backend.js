function promedioTotal(){
    let tiempo1 = parseFloat(document.getElementById('tiempo1').value);
    let tiempo2 = parseFloat(document.getElementById('tiempo2').value);
    let tiempo3 = parseFloat(document.getElementById('tiempo3').value);
    let tiempo4 = parseFloat(document.getElementById('tiempo4').value);
    let tiempo5 = parseFloat(document.getElementById('tiempo5').value);

    let promedioTiempo = (tiempo1 + tiempo2 + tiempo3 + tiempo4 + tiempo5)/5;
    
    document.getElementById('resultado').value = promedioTiempo.toFixed(2);


}

// TAREA 2

function perimetro(){
    let baseMayor = parseFloat(document.getElementById('baseMayor').value);
    let baseMenor = parseFloat(document.getElementById('baseMenor').value);
    let ladoIzquierdo = parseFloat(document.getElementById('ladow').value);
    let ladoDerecho = parseFloat(document.getElementById('lado1').value);
    let perimetro = baseMayor+baseMenor+ladoDerecho+ladoIzquierdo;
    document.getElementById('metrosCerca').value = perimetro
}

function litrosPesticida(){
    
    let baseMayor = parseFloat(document.getElementById('baseMayor').value);
    let baseMenor = parseFloat(document.getElementById('baseMenor').value);
    let altura = parseFloat(document.getElementById('altura').value);
    let rendimiento = parseFloat(document.getElementById('rendimiento').value);
    let area = ((baseMayor+baseMenor)*altura)/2;
    let litrosTotal = area/rendimiento;
    
    document.getElementById('resultado2').value = litrosTotal.toFixed(2);
}

function calcularTotal2(){
    litrosPesticida();
    perimetro();

}

// TAREA 3

function calcularTotal3(){
    let base = parseFloat(document.getElementById('baseLadrillo').value);
    let ancho = parseFloat(document.getElementById('anchoLadrillo').value);
    let metros = parseFloat(document.getElementById('metros').value);
    let cL = metros/((0.01+base)+(0.01+ancho))

    document.getElementById('resultado3').value = cL.toFixed(0);



}

// tarea 4

function calcularTotal4(){
    let peso = parseFloat(document.getElementById('peso').value);
    let altura = parseFloat(document.getElementById('altura').value);
    let IMC = peso/(altura*altura);
    
    let mensaje = "";
    


    
    if (IMC < 18.5) {
        mensaje = "Bajo peso";
    } else if (IMC >= 18.5 && IMC < 24.9) {
        mensaje = "Peso normal";
    } else if (IMC >= 25 && IMC < 29.9) {
        mensaje = "Sobrepeso";
    } else {
        mensaje = "Obesidad";
    }

    document.getElementById('resultado4').value = mensaje;
}


