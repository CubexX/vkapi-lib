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

public class Groups {
    public static String isMember(String params) {
        // http://vk.com/dev/groups.isMember
        return Vk.query("groups.isMember", params);
    }


    public static String getById(String params) {
        // http://vk.com/dev/groups.getById
        return Vk.query("groups.getById", params);
    }


    public static String get(String params) {
        // http://vk.com/dev/groups.get
        return Vk.query("groups.get", params);
    }


    public static String getMembers(String params) {
        // http://vk.com/dev/groups.getMembers
        return Vk.query("groups.getMembers", params);
    }


    public static String join(String params) {
        // http://vk.com/dev/groups.join
        return Vk.query("groups.join", params);
    }


    public static String leave(String params) {
        // http://vk.com/dev/groups.leave
        return Vk.query("groups.leave", params);
    }


    public static String search(String params) {
        // http://vk.com/dev/groups.search
        return Vk.query("groups.search", params);
    }


    public static String getInvites(String params) {
        // http://vk.com/dev/groups.getInvites
        return Vk.query("groups.getInvites", params);
    }


    public static String getInvitedUsers(String params) {
        // http://vk.com/dev/groups.getInvitedUsers
        return Vk.query("groups.getInvitedUsers", params);
    }


    public static String banUser(String params) {
        // http://vk.com/dev/groups.banUser
        return Vk.query("groups.banUser", params);
    }


    public static String unbanUser(String params) {
        // http://vk.com/dev/groups.unbanUser
        return Vk.query("groups.unbanUser", params);
    }


    public static String getBanned(String params) {
        // http://vk.com/dev/groups.getBanned
        return Vk.query("groups.getBanned", params);
    }


    public static String create(String params) {
        // http://vk.com/dev/groups.create
        return Vk.query("groups.create", params);
    }


    public static String edit(String params) {
        // http://vk.com/dev/groups.edit
        return Vk.query("groups.edit", params);
    }


    public static String editPlace(String params) {
        // http://vk.com/dev/groups.editPlace
        return Vk.query("groups.editPlace", params);
    }


    public static String getSettings(String params) {
        // http://vk.com/dev/groups.getSettings
        return Vk.query("groups.getSettings", params);
    }


    public static String getRequests(String params) {
        // http://vk.com/dev/groups.getRequests
        return Vk.query("groups.getRequests", params);
    }


    public static String editManager(String params) {
        // http://vk.com/dev/groups.editManager
        return Vk.query("groups.editManager", params);
    }


    public static String invite(String params) {
        // http://vk.com/dev/groups.invite
        return Vk.query("groups.invite", params);
    }


    public static String addLink(String params) {
        // http://vk.com/dev/groups.addLink
        return Vk.query("groups.addLink", params);
    }


    public static String deleteLink(String params) {
        // http://vk.com/dev/groups.deleteLink
        return Vk.query("groups.deleteLink", params);
    }


    public static String editLink(String params) {
        // http://vk.com/dev/groups.editLink
        return Vk.query("groups.editLink", params);
    }


    public static String reorderLink(String params) {
        // http://vk.com/dev/groups.reorderLink
        return Vk.query("groups.reorderLink", params);
    }


    public static String removeUser(String params) {
        // http://vk.com/dev/groups.removeUser
        return Vk.query("groups.removeUser", params);
    }


    public static String approveRequest(String params) {
        // http://vk.com/dev/groups.approveRequest
        return Vk.query("groups.approveRequest", params);
    }
}
