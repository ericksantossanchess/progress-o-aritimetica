function media() {
    var a1= parseFloat(document.getElementById("nota1").value);
    var n = parseFloat(document.getElementById("nota2").value);
    var r = parseFloat(document.getElementById("nota3").value);
    var soma = (nota1 + nota2 + nota3);
    var media = (nota1 + nota2 + nota3) / 3;
    document.getElementById("soma").innerHTML = soma;
    document.getElementById("soma").innerHTML = media;
}