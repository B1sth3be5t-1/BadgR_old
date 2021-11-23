package com.badgr.ui.login;

import androidx.annotation.Nullable;
import com.badgr.scoutClasses.scoutPerson;

/**
 * Authentication result : success (user details) or error message.
 */
class LoginResult {
    @Nullable
    private scoutPerson success;
    @Nullable
    private Integer error;

    LoginResult(@Nullable Integer error) {
        this.error = error;
    }

    LoginResult(@Nullable scoutPerson success) {
        this.success = success;
    }

    @Nullable
    scoutPerson getSuccess() {
        return success;
    }

    @Nullable
    Integer getError() {
        return error;
    }
}