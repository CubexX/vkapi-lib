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

public class Board {
    public static String getTopics(String params) {
        // http://vk.com/dev/board.getTopics
        return Vk.query("board.getTopics", params);
    }


    public static String getComments(String params) {
        // http://vk.com/dev/board.getComments
        return Vk.query("board.getComments", params);
    }


    public static String addTopic(String params) {
        // http://vk.com/dev/board.addTopic
        return Vk.query("board.addTopic", params);
    }


    public static String addComment(String params) {
        // http://vk.com/dev/board.addComment
        return Vk.query("board.addComment", params);
    }


    public static String deleteTopic(String params) {
        // http://vk.com/dev/board.deleteTopic
        return Vk.query("board.deleteTopic", params);
    }


    public static String editTopic(String params) {
        // http://vk.com/dev/board.editTopic
        return Vk.query("board.editTopic", params);
    }


    public static String editComment(String params) {
        // http://vk.com/dev/board.editComment
        return Vk.query("board.editComment", params);
    }


    public static String restoreComment(String params) {
        // http://vk.com/dev/board.restoreComment
        return Vk.query("board.restoreComment", params);
    }


    public static String deleteComment(String params) {
        // http://vk.com/dev/board.deleteComment
        return Vk.query("board.deleteComment", params);
    }


    public static String openTopic(String params) {
        // http://vk.com/dev/board.openTopic
        return Vk.query("board.openTopic", params);
    }


    public static String closeTopic(String params) {
        // http://vk.com/dev/board.closeTopic
        return Vk.query("board.closeTopic", params);
    }


    public static String fixTopic(String params) {
        // http://vk.com/dev/board.fixTopic
        return Vk.query("board.fixTopic", params);
    }


    public static String unfixTopic(String params) {
        // http://vk.com/dev/board.unfixTopic
        return Vk.query("board.unfixTopic", params);
    }
}
