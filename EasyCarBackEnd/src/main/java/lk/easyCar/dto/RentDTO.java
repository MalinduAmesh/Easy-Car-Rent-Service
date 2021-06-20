package lk.easyCar.dto;

import lk.easyCar.entity.RentDetails;
import lk.easyCar.entity.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class RentDTO {
    private String rentID;

    private User cusID;
    private List<RentDetailsDTO> rentDetails;

}
