package br.com.alinelopes.shiftcloud.model;

/**
 * Created by alunoshift on 03/06/2017.
 */

public class Carro {
    private String modelo;
    private String id;
    private String fabricante;

    public String getId() {
        return id;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }


    public void setId(String id) {
        this.id = id;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Carro carro = (Carro) o;

        if (modelo != null ? !modelo.equals(carro.modelo) : carro.modelo != null) return false;
        if (id != null ? !id.equals(carro.id) : carro.id != null) return false;
        return fabricante != null ? fabricante.equals(carro.fabricante) : carro.fabricante == null;

    }

    @Override
    public int hashCode() {
        int result = modelo != null ? modelo.hashCode() : 0;
        result = 31 * result + (id != null ? id.hashCode() : 0);
        result = 31 * result + (fabricante != null ? fabricante.hashCode() : 0);
        return result;
    }
}
