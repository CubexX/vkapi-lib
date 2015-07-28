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

public class Messages {
    public static String get(String params) {
        // http://vk.com/dev/messages.get
        return Vk.query("messages.get", params);
    }

    public static String getDialogs(String params) {
        // http://vk.com/dev/messages.getDialogs
        return Vk.query("messages.getDialogs", params);
    }

    public static String getById(String params) {
        // http://vk.com/dev/messages.getById
        return Vk.query("messages.getById", params);
    }

    public static String search(String params) {
        // http://vk.com/dev/messages.search
        return Vk.query("messages.search", params);
    }

    public static String getHistory(String params) {
        // http://vk.com/dev/messages.getHistory
        return Vk.query("messages.getHistory", params);
    }

    public static String send(String params) {
        // http://vk.com/dev/messages.send
        return Vk.query("messages.send", params);
    }

    public static String delete(String params) {
        // http://vk.com/dev/messages.delete
        return Vk.query("messages.delete", params);
    }

    public static String deleteDialog(String params) {
        // http://vk.com/dev/messages.deleteDialog
        return Vk.query("messages.deleteDialog", params);
    }

    public static String restore(String params) {
        // http://vk.com/dev/messages.restore
        return Vk.query("messages.restore", params);
    }

    public static String markAsRead(String params) {
        // http://vk.com/dev/messages.markAsRead
        return Vk.query("messages.markAsRead", params);
    }

    public static String markAsImportant(String params) {
        // http://vk.com/dev/messages.markAsImportant
        return Vk.query("messages.markAsImportant", params);
    }

    public static String getLongPollServer(String params) {
        // http://vk.com/dev/messages.getLongPollServer
        return Vk.query("messages.getLongPollServer", params);
    }

    public static String getLongPollHistory(String params) {
        // http://vk.com/dev/messages.getLongPollHistory
        return Vk.query("messages.getLongPollHistory", params);
    }

    public static String getChat(String params) {
        // http://vk.com/dev/messages.getChat
        return Vk.query("messages.getChat", params);
    }

    public static String createChat(String params) {
        // http://vk.com/dev/messages.createChat
        return Vk.query("messages.createChat", params);
    }

    public static String editChat(String params) {
        // http://vk.com/dev/messages.editChat
        return Vk.query("messages.editChat", params);
    }

    public static String getChatUsers(String params) {
        // http://vk.com/dev/messages.getChatUsers
        return Vk.query("messages.getChatUsers", params);
    }

    public static String setActivity(String params) {
        // http://vk.com/dev/messages.setActivity
        return Vk.query("messages.setActivity", params);
    }

    public static String searchDialogs(String params) {
        // http://vk.com/dev/messages.searchDialogs
        return Vk.query("messages.searchDialogs", params);
    }

    public static String addChatUser(String params) {
        // http://vk.com/dev/messages.addChatUser
        return Vk.query("messages.addChatUser", params);
    }

    public static String removeChatUser(String params) {
        // http://vk.com/dev/messages.removeChatUser
        return Vk.query("messages.removeChatUser", params);
    }

    public static String getLastActivity(String params) {
        // http://vk.com/dev/messages.getLastActivity
        return Vk.query("messages.getLastActivity", params);
    }

    public static String setChatPhoto(String params) {
        // http://vk.com/dev/messages.setChatPhoto
        return Vk.query("messages.setChatPhoto", params);
    }

    public static String deleteChatPhoto(String params) {
        // http://vk.com/dev/messages.deleteChatPhoto
        return Vk.query("messages.deleteChatPhoto", params);
    }
}