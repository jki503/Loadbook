package com.loadbook.user.entity;

import static lombok.AccessLevel.*;

import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.Table;

import com.loadbook.user.entity.vo.BaseUserInformation;
import com.loadbook.user.entity.vo.SocialUserInformation;

import lombok.NoArgsConstructor;

@Entity
@Table(name = "social_user")
@NoArgsConstructor(access = PROTECTED)
public class SocialUser extends User {

	@Enumerated
	SocialUserInformation socialUserInformation;

	public SocialUser(BaseUserInformation userInformation,
		SocialUserInformation socialUserInformation) {
		super(userInformation);
		this.socialUserInformation = socialUserInformation;
	}
}
