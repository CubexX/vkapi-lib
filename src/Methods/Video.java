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

public class Video {
    public static String get(String params) {
        // http://vk.com/dev/video.get
        return Vk.query("video.get", params);
    }


    public static String edit(String params) {
        // http://vk.com/dev/video.edit
        return Vk.query("video.edit", params);
    }


    public static String add(String params) {
        // http://vk.com/dev/video.add
        return Vk.query("video.add", params);
    }


    public static String save(String params) {
        // http://vk.com/dev/video.save
        return Vk.query("video.save", params);
    }


    public static String delete(String params) {
        // http://vk.com/dev/video.delete
        return Vk.query("video.delete", params);
    }


    public static String restore(String params) {
        // http://vk.com/dev/video.restore
        return Vk.query("video.restore", params);
    }


    public static String search(String params) {
        // http://vk.com/dev/video.search
        return Vk.query("video.search", params);
    }


    public static String getUserVideos(String params) {
        // http://vk.com/dev/video.getUserVideos
        return Vk.query("video.getUserVideos", params);
    }


    public static String getAlbums(String params) {
        // http://vk.com/dev/video.getAlbums
        return Vk.query("video.getAlbums", params);
    }


    public static String getAlbumById(String params) {
        // http://vk.com/dev/video.getAlbumById
        return Vk.query("video.getAlbumById", params);
    }


    public static String addAlbum(String params) {
        // http://vk.com/dev/video.addAlbum
        return Vk.query("video.addAlbum", params);
    }


    public static String editAlbum(String params) {
        // http://vk.com/dev/video.editAlbum
        return Vk.query("video.editAlbum", params);
    }


    public static String deleteAlbum(String params) {
        // http://vk.com/dev/video.deleteAlbum
        return Vk.query("video.deleteAlbum", params);
    }


    public static String reorderAlbums(String params) {
        // http://vk.com/dev/video.reorderAlbums
        return Vk.query("video.reorderAlbums", params);
    }


    public static String addToAlbum(String params) {
        // http://vk.com/dev/video.addToAlbum
        return Vk.query("video.addToAlbum", params);
    }


    public static String removeFromAlbum(String params) {
        // http://vk.com/dev/video.removeFromAlbum
        return Vk.query("video.removeFromAlbum", params);
    }


    public static String getAlbumsByVideo(String params) {
        // http://vk.com/dev/video.getAlbumsByVideo
        return Vk.query("video.getAlbumsByVideo", params);
    }


    public static String getComments(String params) {
        // http://vk.com/dev/video.getComments
        return Vk.query("video.getComments", params);
    }


    public static String createComment(String params) {
        // http://vk.com/dev/video.createComment
        return Vk.query("video.createComment", params);
    }


    public static String deleteComment(String params) {
        // http://vk.com/dev/video.deleteComment
        return Vk.query("video.deleteComment", params);
    }


    public static String restoreComment(String params) {
        // http://vk.com/dev/video.restoreComment
        return Vk.query("video.restoreComment", params);
    }


    public static String editComment(String params) {
        // http://vk.com/dev/video.editComment
        return Vk.query("video.editComment", params);
    }


    public static String getTags(String params) {
        // http://vk.com/dev/video.getTags
        return Vk.query("video.getTags", params);
    }


    public static String putTag(String params) {
        // http://vk.com/dev/video.putTag
        return Vk.query("video.putTag", params);
    }


    public static String removeTag(String params) {
        // http://vk.com/dev/video.removeTag
        return Vk.query("video.removeTag", params);
    }


    public static String getNewTags(String params) {
        // http://vk.com/dev/video.getNewTags
        return Vk.query("video.getNewTags", params);
    }


    public static String report(String params) {
        // http://vk.com/dev/video.report
        return Vk.query("video.report", params);
    }


    public static String reportComment(String params) {
        // http://vk.com/dev/video.reportComment
        return Vk.query("video.reportComment", params);
    }
}
