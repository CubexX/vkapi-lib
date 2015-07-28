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

public class Newsfeed {
    public static String get(String params) {
        // http://vk.com/dev/newsfeed.get
        return Vk.query("newsfeed.get", params);
    }


    public static String getRecommended(String params) {
        // http://vk.com/dev/newsfeed.getRecommended
        return Vk.query("newsfeed.getRecommended", params);
    }


    public static String getComments(String params) {
        // http://vk.com/dev/newsfeed.getComments
        return Vk.query("newsfeed.getComments", params);
    }


    public static String getMentions(String params) {
        // http://vk.com/dev/newsfeed.getMentions
        return Vk.query("newsfeed.getMentions", params);
    }


    public static String getBanned(String params) {
        // http://vk.com/dev/newsfeed.getBanned
        return Vk.query("newsfeed.getBanned", params);
    }


    public static String addBan(String params) {
        // http://vk.com/dev/newsfeed.addBan
        return Vk.query("newsfeed.addBan", params);
    }


    public static String deleteBan(String params) {
        // http://vk.com/dev/newsfeed.deleteBan
        return Vk.query("newsfeed.deleteBan", params);
    }


    public static String ignoreItem(String params) {
        // http://vk.com/dev/newsfeed.ignoreItem
        return Vk.query("newsfeed.ignoreItem", params);
    }


    public static String unignoreItem(String params) {
        // http://vk.com/dev/newsfeed.unignoreItem
        return Vk.query("newsfeed.unignoreItem", params);
    }


    public static String search(String params) {
        // http://vk.com/dev/newsfeed.search
        return Vk.query("newsfeed.search", params);
    }


    public static String getLists(String params) {
        // http://vk.com/dev/newsfeed.getLists
        return Vk.query("newsfeed.getLists", params);
    }


    public static String saveList(String params) {
        // http://vk.com/dev/newsfeed.saveList
        return Vk.query("newsfeed.saveList", params);
    }


    public static String deleteList(String params) {
        // http://vk.com/dev/newsfeed.deleteList
        return Vk.query("newsfeed.deleteList", params);
    }


    public static String unsubscribe(String params) {
        // http://vk.com/dev/newsfeed.unsubscribe
        return Vk.query("newsfeed.unsubscribe", params);
    }


    public static String getSuggestedSources(String params) {
        // http://vk.com/dev/newsfeed.getSuggestedSources
        return Vk.query("newsfeed.getSuggestedSources", params);
    }
}
