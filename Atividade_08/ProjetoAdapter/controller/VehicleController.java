package ProjetoAdapter.controller;

import ProjetoAdapter.model.IVehicleStorage;
import ProjetoAdapter.model.Vehicle;
import ProjetoAdapter.view.VehicleView;

public class VehicleController {
    private IVehicleStorage storage;
    private VehicleView view;

    //constructor
    public VehicleController(IVehicleStorage storage, VehicleView view) {
        this.storage = storage;
        this.view = view;
    }

    //methods
    public void armazenarVeiculo(Vehicle vehicle) {
        storage.saveVehicleData(vehicle);
        view.mostrarVeiculoArmazenado(vehicle);
    }
}