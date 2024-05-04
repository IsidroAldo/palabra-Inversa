class PalabraInversa {

private String palabra;

PalabraInversa(){

}
public String getInversa(){
    return new StringBuilder (palabra).reverse().toString();
}

public String getPalabra() {
    return palabra;
}

public void setPalabra(String palabra) {
    this.palabra = palabra;
}

@Override
public String toString() {
    return "PalabraInversa [palabra=" + palabra + "]";
}



}