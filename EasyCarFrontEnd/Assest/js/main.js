
/*------------------------------------------------------------- Save Car ------------------------------------------------------------*/

$("#btnFinalAddNewCar").click(function () {

    console.log("Hello");

    let carID = $('#inputCarID').val();
    let carModel = $('#inputCarModel').val();
    let carType = $('#inputCarType').val();
    let carImg1 = $('#carImg01').val();
    let carImg2 = $('#carImg02').val();
    let carImg3 = $('#carImg03').val();
    let carImg4 = $('#carImg04').val();
    let carTransmissionType = $('#inputCarTransmissionType').val();
    let carFuelType = $('#inputCarFuelType').val();
    let carColor = $('#inputCarColor').val();
    let inputCarStatus = $('#inputCarStatus').val();
    let lostWavierFee =$('#inputCarLostWavier').val();
    let passenger = $('#inputPassenger').val();
    let carDailyRate = $('#inputCarDailyRate').val();
    let carMonthlyRate = $('#inputCarMonthlyRate').val();
    let carFreeKmForADay = $('#inputCarFreeKmForADay').val();
    let carFreeKmForAMonth = $('#carFreeKmForAMonth').val();
    let carPriceForExtraKM = $('#inputCarPriceForExtraKM').val();

    console.log(lostWavierFee);

    $.ajax({
        method:"post",
        url:"http://localhost:8080/EasyCarBackEnd_war_exploded/vehicle",
        contentType:"application/json",
        data:JSON.stringify({

            "carID": carID,
            "carModel": carModel,
            "carType": carType,
            "carImg1": carImg1,
            "carImg2": carImg2,
            "carImg3": carImg3,
            "carImg4": carImg4,
            "carTransmissionType": carTransmissionType,
            "carFuelType": carFuelType,
            "carColor": carColor,
            "carStatus": inputCarStatus,
            "rentLosWaiver":lostWavierFee,
            "passenger": passenger,
            "carDailyRate": carDailyRate,
            "carMonthlyRate": carMonthlyRate,
            "carFreeKmForDay": carFreeKmForADay,
            "carFreeKmForMonth": carFreeKmForAMonth,
            "carPriceForExtraKm": carPriceForExtraKM

        }),
        success:function (res) {
            if (res.message == "Success"){
                alert("Success");
            }else{
                alert(res.data);
            }

        }
    })
});

// $("#btn-manage-carDetails").click(function () {
//
//     $('#tblCarDetails').empty();
//     $.ajax({
//         method: 'get',
//         url: "http://localhost:8080/EasyCarBackEnd_war_exploded/vehicle",
//         contentType: "application/json",
//         success:function (res) {
//             console.log(res)
//
//             for (var i in res.data){
//                 let carID = res.data[i].carID;
//                 let carModel = res.data[i].carModel;
//                 let carType = res.data[i].carType;
//                 let carColor = res.data[i].carColor;
//                 let carTransmissionType = res.data[i].carTransmissionType;
//                 let carStatus = res.data[i].carStatus;
//                 let passengers = res.data[i].passenger;
//
//
//                 var row = `<tr><td>${carID}</td><td>${carModel}</td><td>${carType}</td><td>${carColor}</td><td> ${carTransmissionType}</td><td> ${carStatus}</td><td> ${passengers}</td><td><button class="btn btn-warning fff" id="${carID}" onclick="updateDetailsCar(this)">Update</button></td></tr>`;
//                 $('#tblCarDetails').append(row);
//
//                 console.log("END" + i);
//             }
//         }
//     })
//
//
// })

// $(".fff").click(function () {
//     console.log("update")
// })

// function updateDetailsCar(id){
//     console.log("update")
//     var carUpdate =($(id).attr('id'));
//
//     $('#UpdateCar').css("display","block");
//     $('#viewAllCars').css("display","none");
// }
