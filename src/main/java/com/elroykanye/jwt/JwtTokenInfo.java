package com.elroykanye.jwt;

import lombok.*;

import java.util.Date;
import java.util.Map;

/**
 * @author Elroy Kanye
 * @date 24 - 02 - 2022
 * @since 1.0
 * @version 1.0
 * @description JwtTokenInfo used to store the token information to be used in the generation of the token
 */
@Getter @Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class JwtTokenInfo {
    private String username;
    private Date expirationDate;
    private String role;
    private String issuer;
    private String audience;
    private String subject;
    private String jwtId;
    Map<String, Object> claims;
}
