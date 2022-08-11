package POOT;

public class Main {

    public static void main(String[] args) {

        Animal animales = new Animal();
        animales.edadA = 5;
        animales.especie = "Aves";
        animales.pesoGramos = 300;
        animales.sexo = "Macho";
        animales.alimentacion = "Nueces";

        Yo miPersona = new Yo();
        miPersona.colorDeCabello = "Cafe";
        miPersona.edad = 18;
        miPersona.altura = 50;
        miPersona.pesoKiloGramos = 57;
        miPersona.genero = "Masculino";

        System.out.println(miPersona.Madre);
        System.out.println(miPersona.Padre);

        Mujer sMujer = new Mujer();
        sMujer.alturaPromedio = 157;
        sMujer.pesoPromedio = 68;

        Hombre sHombre = new Hombre();
        sHombre.alturaPromedioH = 170;
        sHombre.pesoPromedioH = 74;

    }
}
