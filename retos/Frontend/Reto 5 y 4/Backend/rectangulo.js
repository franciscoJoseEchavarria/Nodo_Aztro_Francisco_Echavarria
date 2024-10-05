// calculo del area de rectangulo
function areaRectangulo (){
    let base = parseFloat(document.getElementById('base-centimetros').value);
    let altura = parseFloat(document.getElementById('altura-centimetros').value);
    let area = base * altura;
    
    document.getElementById('area').value = area;
}

function perimetroRectangulo (){
    let base = parseFloat(document.getElementById('base-centimetros').value);
    let altura = parseFloat(document.getElementById('altura-centimetros').value);
    let perimetro = 2 * (base + altura);
    
    document.getElementById('perimetro').value = perimetro;
}

function diagonalRectangulo (){
    let base = parseFloat(document.getElementById('base-centimetros').value);
    let altura = parseFloat(document.getElementById('altura-centimetros').value);
    let diagonal = Math.sqrt(Math.pow (base, 2) + Math.pow(altura,2));
    document.getElementById('diagonal').value = diagonal.toFixed(2);    
}


function calcularTotal(){
    areaRectangulo();
    perimetroRectangulo();
    diagonalRectangulo();
}