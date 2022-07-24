package com.abrupt.bha_koh.utilities;

public enum NavigationItems {
    DASHBOARD,
    ABOUT,
    FAQ;

    public String localizedString() {
        switch(this) {
            case DASHBOARD:
                return "Dashboard";
            case ABOUT:
                return "About";
            case FAQ:
                return "FAQ";
            default:
                return "No navigation item found.";
        }
    }
}
