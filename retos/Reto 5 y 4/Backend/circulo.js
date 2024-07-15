function areaCirculo (){
    let radio = parseFloat(document.getElementById('radio').value);
    let area = Math.PI * Math.pow (radio,2);
    
    document.getElementById('area').value = area.toFixed(2);
}

function perimetroCirculo (){
    let radio = parseFloat(document.getElementById('radio').value);
    
    let perimetro = 2 * Math.PI * radio;
    document.getElementById().
    
    document.getElementById('perimetro').value = perimetro.toFixed(2);
}

function diametro (){
    let radio = parseFloat(document.getElementById('radio').value);
    let diametro = radio*2;
    document.getElementById('diagonal').value = diametro.toFixed(2);    
}


function calcularTotal(){
    areaCirculo ()
    perimetroCirculo ();
    diametro();
}