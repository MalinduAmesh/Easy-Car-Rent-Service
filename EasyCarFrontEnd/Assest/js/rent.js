$("#btn-manage-carDetails").click(function () {

    $('#tblCarDetails').empty();
    $.ajax({
        method: 'get',
        url: "http://localhost:8080/EasyCarBackEnd_war_exploded/vehicle",
        contentType: "application/json",
        success:function (res) {
            console.log(res)

            for (var i in res.data){
                let carID = res.data[i].carID;
                let carModel = res.data[i].carModel;
                let carType = res.data[i].carType;
                let carColor = res.data[i].carColor;
                let carTransmissionType = res.data[i].carTransmissionType;
                let carStatus = res.data[i].carStatus;
                let passengers = res.data[i].passenger;


                var row = `<tr><td>${carID}</td><td>${carModel}</td><td>${carType}</td><td>${carColor}</td><td> ${carTransmissionType}</td>
<td> ${carStatus}</td><td> ${passengers}</td><td><button  class="btn btn-warning fff" id="${carID}" onclick="updateDetailsCar(this)">Update</button>
<button class="btn btn-danger " id="${carID}" onclick="DeleteCar(this)">Delete</button></td></tr>`;
                $('#tblCarDetails').append(row);

                console.log("END" + i);
            }
        }
    })


})