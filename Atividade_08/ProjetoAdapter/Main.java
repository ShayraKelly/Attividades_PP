package ProjetoAdapter;

import ProjetoAdapter.controller.VehicleController;
import ProjetoAdapter.model.*;
import ProjetoAdapter.view.VehicleView;

public class Main {
    public static void main(String[] args) {
        OldVehicleStorage oldStorage = new OldVehicleStorage();
        IVehicleStorage adapter = new VehicleStorageAdapter(oldStorage);
        VehicleView view = new VehicleView();
        VehicleController controller = new VehicleController(adapter, view);

        Vehicle v = new Vehicle("1234", "Caminhão Volvo", 2020);
        controller.armazenarVeiculo(v);
    }
}