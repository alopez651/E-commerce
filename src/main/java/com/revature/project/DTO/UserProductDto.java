package com.revature.project.DTO;

//import com.revature.project.Entity.Cart;
import com.revature.project.Entity.Product;
//import com.revature.project.Entity.ProductCart;
import com.revature.project.Entity.Users;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class UserProductDto {
    Users users;
    Product product;
}
