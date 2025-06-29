package ProjetoAdapter.model;

public class VehicleStorageAdapter implements IVehicleStorage {
    private OldVehicleStorage oldStorage;

    public VehicleStorageAdapter(OldVehicleStorage oldStorage) {
        this.oldStorage = oldStorage;
    }

    @Override
    public void saveVehicleData(Vehicle vehicle) {
        String vehicleDataString = convertVehicleToString(vehicle);
        oldStorage.storeVehicleData(vehicleDataString);
        System.out.println("VehicleStorageAdapter: Vehicle data adapted and sent to OldVehicleStorage.");
    }

    private String convertVehicleToString(Vehicle vehicle) {
        StringBuilder sb = new StringBuilder();
        sb.append("ID:").append(vehicle.getId()).append(";");
        sb.append("MODEL:").append(vehicle.getModel()).append(";");
        sb.append("YEAR:").append(vehicle.getYear());
        return sb.toString();
    }
}