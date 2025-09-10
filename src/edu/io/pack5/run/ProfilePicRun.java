package edu.io.pack5.run;

import edu.io.pack5.service.ProfilePicService;

public class ProfilePicRun {
    public static void main(String[] args) {
        ProfilePicService pps = new ProfilePicService();
        pps.createProfileFolder();
    }
}
