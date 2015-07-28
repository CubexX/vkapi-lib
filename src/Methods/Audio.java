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

public class Audio {
    public static String get(String params) {
        // http://vk.com/dev/audio.get
        return Vk.query("audio.get", params);
    }


    public static String getById(String params) {
        // http://vk.com/dev/audio.getById
        return Vk.query("audio.getById", params);
    }


    public static String getLyrics(String params) {
        // http://vk.com/dev/audio.getLyrics
        return Vk.query("audio.getLyrics", params);
    }


    public static String search(String params) {
        // http://vk.com/dev/audio.search
        return Vk.query("audio.search", params);
    }


    public static String getUploadServer(String params) {
        // http://vk.com/dev/audio.getUploadServer
        return Vk.query("audio.getUploadServer", params);
    }


    public static String save(String params) {
        // http://vk.com/dev/audio.save
        return Vk.query("audio.save", params);
    }


    public static String add(String params) {
        // http://vk.com/dev/audio.add
        return Vk.query("audio.add", params);
    }


    public static String delete(String params) {
        // http://vk.com/dev/audio.delete
        return Vk.query("audio.delete", params);
    }


    public static String edit(String params) {
        // http://vk.com/dev/audio.edit
        return Vk.query("audio.edit", params);
    }


    public static String reorder(String params) {
        // http://vk.com/dev/audio.reorder
        return Vk.query("audio.reorder", params);
    }


    public static String restore(String params) {
        // http://vk.com/dev/audio.restore
        return Vk.query("audio.restore", params);
    }


    public static String getAlbums(String params) {
        // http://vk.com/dev/audio.getAlbums
        return Vk.query("audio.getAlbums", params);
    }


    public static String addAlbum(String params) {
        // http://vk.com/dev/audio.addAlbum
        return Vk.query("audio.addAlbum", params);
    }


    public static String editAlbum(String params) {
        // http://vk.com/dev/audio.editAlbum
        return Vk.query("audio.editAlbum", params);
    }


    public static String deleteAlbum(String params) {
        // http://vk.com/dev/audio.deleteAlbum
        return Vk.query("audio.deleteAlbum", params);
    }


    public static String moveToAlbum(String params) {
        // http://vk.com/dev/audio.moveToAlbum
        return Vk.query("audio.moveToAlbum", params);
    }


    public static String setBroadcast(String params) {
        // http://vk.com/dev/audio.setBroadcast
        return Vk.query("audio.setBroadcast", params);
    }


    public static String getBroadcastList(String params) {
        // http://vk.com/dev/audio.getBroadcastList
        return Vk.query("audio.getBroadcastList", params);
    }


    public static String getRecommendations(String params) {
        // http://vk.com/dev/audio.getRecommendations
        return Vk.query("audio.getRecommendations", params);
    }


    public static String getPopular(String params) {
        // http://vk.com/dev/audio.getPopular
        return Vk.query("audio.getPopular", params);
    }


    public static String getCount(String params) {
        // http://vk.com/dev/audio.getCount
        return Vk.query("audio.getCount", params);
    }
}
