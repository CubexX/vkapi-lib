package Methods;

/*
#
# Copyright (c) 2015 Alexey Miroshnichenko
#
# Permission is hereby granted, free of charge, to any person obtaining
# a copy of this software and associated documentation files (the
# "Software"), to deal in the Software without restriction, including
# without limitation the rights to use, copy, modify, merge, publish,
# distribute, sublicense, and/or sell copies of the Software, and to
# permit persons to whom the Software is furnished to do so, subject to
# the following conditions:
#
# The above copyright notice and this permission notice shall be
# included in all copies or substantial portions of the Software.
#
# THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND,
# EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF
# MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND
# NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE
# LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION
# OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION
# WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
#
*/

import VKontakte.Vk;

public class Account {
    public static String getCounters(String params) {
        // http://vk.com/dev/account.getCounters
        return Vk.query("account.getCounters", params);
    }


    public static String setNameInMenu(String params) {
        // http://vk.com/dev/account.setNameInMenu
        return Vk.query("account.setNameInMenu", params);
    }


    public static String setOnline(String params) {
        // http://vk.com/dev/account.setOnline
        return Vk.query("account.setOnline", params);
    }


    public static String setOffline(String params) {
        // http://vk.com/dev/account.setOffline
        return Vk.query("account.setOffline", params);
    }


    public static String lookupContacts(String params) {
        // http://vk.com/dev/account.lookupContacts
        return Vk.query("account.lookupContacts", params);
    }


    public static String registerDevice(String params) {
        // http://vk.com/dev/account.registerDevice
        return Vk.query("account.registerDevice", params);
    }


    public static String unregisterDevice(String params) {
        // http://vk.com/dev/account.unregisterDevice
        return Vk.query("account.unregisterDevice", params);
    }


    public static String setSilenceMode(String params) {
        // http://vk.com/dev/account.setSilenceMode
        return Vk.query("account.setSilenceMode", params);
    }


    public static String getPushSettings(String params) {
        // http://vk.com/dev/account.getPushSettings
        return Vk.query("account.getPushSettings", params);
    }


    public static String setPushSettings(String params) {
        // http://vk.com/dev/account.setPushSettings
        return Vk.query("account.setPushSettings", params);
    }


    public static String getAppPermissions(String params) {
        // http://vk.com/dev/account.getAppPermissions
        return Vk.query("account.getAppPermissions", params);
    }


    public static String getActiveOffers(String params) {
        // http://vk.com/dev/account.getActiveOffers
        return Vk.query("account.getActiveOffers", params);
    }


    public static String banUser(String params) {
        // http://vk.com/dev/account.banUser
        return Vk.query("account.banUser", params);
    }


    public static String unbanUser(String params) {
        // http://vk.com/dev/account.unbanUser
        return Vk.query("account.unbanUser", params);
    }


    public static String getBanned(String params) {
        // http://vk.com/dev/account.getBanned
        return Vk.query("account.getBanned", params);
    }


    public static String getInfo(String params) {
        // http://vk.com/dev/account.getInfo
        return Vk.query("account.getInfo", params);
    }


    public static String setInfo(String params) {
        // http://vk.com/dev/account.setInfo
        return Vk.query("account.setInfo", params);
    }


    public static String changePassword(String params) {
        // http://vk.com/dev/account.changePassword
        return Vk.query("account.changePassword", params);
    }


    public static String getProfileInfo(String params) {
        // http://vk.com/dev/account.getProfileInfo
        return Vk.query("account.getProfileInfo", params);
    }


    public static String saveProfileInfo(String params) {
        // http://vk.com/dev/account.saveProfileInfo
        return Vk.query("account.saveProfileInfo", params);
    }
}
