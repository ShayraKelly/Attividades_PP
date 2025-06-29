package ProjetoAdapter.view;

import ProjetoAdapter.model.Vehicle;

public class VehicleView {
    public void mostrarVeiculoArmazenado(Vehicle vehicle) {
        System.out.println("Veículo armazenado com sucesso:");
        System.out.println("ID: " + vehicle.getId());
        System.out.println("Modelo: " + vehicle.getModel());
        System.out.println("Ano: " + vehicle.getYear());
    }
}