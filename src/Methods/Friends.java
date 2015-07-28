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

public class Friends {
    public static String get(String params) {
        // http://vk.com/dev/friends.get
        return Vk.query("friends.get", params);
    }


    public static String getOnline(String params) {
        // http://vk.com/dev/friends.getOnline
        return Vk.query("friends.getOnline", params);
    }


    public static String getMutual(String params) {
        // http://vk.com/dev/friends.getMutual
        return Vk.query("friends.getMutual", params);
    }


    public static String getRecent(String params) {
        // http://vk.com/dev/friends.getRecent
        return Vk.query("friends.getRecent", params);
    }


    public static String getRequests(String params) {
        // http://vk.com/dev/friends.getRequests
        return Vk.query("friends.getRequests", params);
    }


    public static String add(String params) {
        // http://vk.com/dev/friends.add
        return Vk.query("friends.add", params);
    }


    public static String edit(String params) {
        // http://vk.com/dev/friends.edit
        return Vk.query("friends.edit", params);
    }


    public static String delete(String params) {
        // http://vk.com/dev/friends.delete
        return Vk.query("friends.delete", params);
    }


    public static String getLists(String params) {
        // http://vk.com/dev/friends.getLists
        return Vk.query("friends.getLists", params);
    }


    public static String addList(String params) {
        // http://vk.com/dev/friends.addList
        return Vk.query("friends.addList", params);
    }


    public static String editList(String params) {
        // http://vk.com/dev/friends.editList
        return Vk.query("friends.editList", params);
    }


    public static String deleteList(String params) {
        // http://vk.com/dev/friends.deleteList
        return Vk.query("friends.deleteList", params);
    }


    public static String getAppUsers(String params) {
        // http://vk.com/dev/friends.getAppUsers
        return Vk.query("friends.getAppUsers", params);
    }


    public static String getByPhones(String params) {
        // http://vk.com/dev/friends.getByPhones
        return Vk.query("friends.getByPhones", params);
    }


    public static String deleteAllRequests(String params) {
        // http://vk.com/dev/friends.deleteAllRequests
        return Vk.query("friends.deleteAllRequests", params);
    }


    public static String getSuggestions(String params) {
        // http://vk.com/dev/friends.getSuggestions
        return Vk.query("friends.getSuggestions", params);
    }


    public static String areFriends(String params) {
        // http://vk.com/dev/friends.areFriends
        return Vk.query("friends.areFriends", params);
    }


    public static String getAvailableForCall(String params) {
        // http://vk.com/dev/friends.getAvailableForCall
        return Vk.query("friends.getAvailableForCall", params);
    }


    public static String search(String params) {
        // http://vk.com/dev/friends.search
        return Vk.query("friends.search", params);
    }
}
