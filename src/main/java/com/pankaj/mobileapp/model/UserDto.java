package com.pankaj.mobileapp.model;

import java.io.Serializable;

/**
 * @author Pankaj Khatiwada
 */
public class UserDto implements Serializable {

    private static final long serialVersionUID = 4865903038919017533L;
    private long id;
    private String userId;
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private String encryptedPassword;
    private String emailVerificationToken;
    private Boolean emailVerificationStatus;

    
}
