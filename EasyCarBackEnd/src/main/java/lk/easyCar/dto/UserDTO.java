package lk.easyCar.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class UserDTO {
    private String cusNicID;
    private String name;
    private String address;
    private String email;
    private String password;
    private String nicImage;
    private String licNo;
    private String licImage;
    private String contact;

    @Override
    public String toString() {
        return "UserDTO{" +
                "cusNicID='" + cusNicID + '\'' +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", nicImage='" + nicImage + '\'' +
                ", licNo='" + licNo + '\'' +
                ", licImage='" + licImage + '\'' +
                ", contact='" + contact + '\'' +
                '}';
    }
}
