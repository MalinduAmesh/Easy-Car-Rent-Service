
function VehicleDTO(carID, carNme) {

    this.__carID = carID;
    this.__carNme = carNme;



    this.getCarID = function () {
        return this.__carID;
    }
    this.setCarID = function (carID) {
        this.__carID = carID;
    }

    this.getcarNme = function () {
        return this.__carNme;
    }
    this.setcarNme = function (carNme) {
        this.__carNme = carNme;
    }

    // this.getLostFee = function () {
    //     return this.__LostFee;
    // }
    // this.setLostFee = function (LostFee) {
    //     this.__LostFee = LostFee;
    // }
    //
    // this.getPassenger = function () {
    //     return this.__passenger;
    // }
    // this.setPassenger = function (passenger) {
    //     this.__passenger = passenger;
    // }
}