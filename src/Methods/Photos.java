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

public class Photos {
    public static String createAlbum(String params) {
        // http://vk.com/dev/photos.createAlbum
        return Vk.query("photos.createAlbum", params);
    }


    public static String editAlbum(String params) {
        // http://vk.com/dev/photos.editAlbum
        return Vk.query("photos.editAlbum", params);
    }


    public static String getAlbums(String params) {
        // http://vk.com/dev/photos.getAlbums
        return Vk.query("photos.getAlbums", params);
    }


    public static String get(String params) {
        // http://vk.com/dev/photos.get
        return Vk.query("photos.get", params);
    }


    public static String getAlbumsCount(String params) {
        // http://vk.com/dev/photos.getAlbumsCount
        return Vk.query("photos.getAlbumsCount", params);
    }


    public static String getById(String params) {
        // http://vk.com/dev/photos.getById
        return Vk.query("photos.getById", params);
    }


    public static String getUploadServer(String params) {
        // http://vk.com/dev/photos.getUploadServer
        return Vk.query("photos.getUploadServer", params);
    }


    public static String getOwnerPhotoUploadServer(String params) {
        // http://vk.com/dev/photos.getOwnerPhotoUploadServer
        return Vk.query("photos.getOwnerPhotoUploadServer", params);
    }


    public static String getChatUploadServer(String params) {
        // http://vk.com/dev/photos.getChatUploadServer
        return Vk.query("photos.getChatUploadServer", params);
    }


    public static String saveOwnerPhoto(String params) {
        // http://vk.com/dev/photos.saveOwnerPhoto
        return Vk.query("photos.saveOwnerPhoto", params);
    }


    public static String saveWallPhoto(String params) {
        // http://vk.com/dev/photos.saveWallPhoto
        return Vk.query("photos.saveWallPhoto", params);
    }


    public static String getWallUploadServer(String params) {
        // http://vk.com/dev/photos.getWallUploadServer
        return Vk.query("photos.getWallUploadServer", params);
    }


    public static String getMessagesUploadServer(String params) {
        // http://vk.com/dev/photos.getMessagesUploadServer
        return Vk.query("photos.getMessagesUploadServer", params);
    }


    public static String saveMessagesPhoto(String params) {
        // http://vk.com/dev/photos.saveMessagesPhoto
        return Vk.query("photos.saveMessagesPhoto", params);
    }


    public static String report(String params) {
        // http://vk.com/dev/photos.report
        return Vk.query("photos.report", params);
    }


    public static String reportComment(String params) {
        // http://vk.com/dev/photos.reportComment
        return Vk.query("photos.reportComment", params);
    }


    public static String search(String params) {
        // http://vk.com/dev/photos.search
        return Vk.query("photos.search", params);
    }


    public static String save(String params) {
        // http://vk.com/dev/photos.save
        return Vk.query("photos.save", params);
    }


    public static String copy(String params) {
        // http://vk.com/dev/photos.copy
        return Vk.query("photos.copy", params);
    }


    public static String edit(String params) {
        // http://vk.com/dev/photos.edit
        return Vk.query("photos.edit", params);
    }


    public static String move(String params) {
        // http://vk.com/dev/photos.move
        return Vk.query("photos.move", params);
    }


    public static String makeCover(String params) {
        // http://vk.com/dev/photos.makeCover
        return Vk.query("photos.makeCover", params);
    }


    public static String reorderAlbums(String params) {
        // http://vk.com/dev/photos.reorderAlbums
        return Vk.query("photos.reorderAlbums", params);
    }


    public static String reorderPhotos(String params) {
        // http://vk.com/dev/photos.reorderPhotos
        return Vk.query("photos.reorderPhotos", params);
    }


    public static String getAll(String params) {
        // http://vk.com/dev/photos.getAll
        return Vk.query("photos.getAll", params);
    }


    public static String getUserPhotos(String params) {
        // http://vk.com/dev/photos.getUserPhotos
        return Vk.query("photos.getUserPhotos", params);
    }


    public static String deleteAlbum(String params) {
        // http://vk.com/dev/photos.deleteAlbum
        return Vk.query("photos.deleteAlbum", params);
    }


    public static String delete(String params) {
        // http://vk.com/dev/photos.delete
        return Vk.query("photos.delete", params);
    }


    public static String restore(String params) {
        // http://vk.com/dev/photos.restore
        return Vk.query("photos.restore", params);
    }


    public static String confirmTag(String params) {
        // http://vk.com/dev/photos.confirmTag
        return Vk.query("photos.confirmTag", params);
    }


    public static String getComments(String params) {
        // http://vk.com/dev/photos.getComments
        return Vk.query("photos.getComments", params);
    }


    public static String getAllComments(String params) {
        // http://vk.com/dev/photos.getAllComments
        return Vk.query("photos.getAllComments", params);
    }


    public static String createComment(String params) {
        // http://vk.com/dev/photos.createComment
        return Vk.query("photos.createComment", params);
    }


    public static String deleteComment(String params) {
        // http://vk.com/dev/photos.deleteComment
        return Vk.query("photos.deleteComment", params);
    }


    public static String restoreComment(String params) {
        // http://vk.com/dev/photos.restoreComment
        return Vk.query("photos.restoreComment", params);
    }


    public static String editComment(String params) {
        // http://vk.com/dev/photos.editComment
        return Vk.query("photos.editComment", params);
    }


    public static String getTags(String params) {
        // http://vk.com/dev/photos.getTags
        return Vk.query("photos.getTags", params);
    }


    public static String putTag(String params) {
        // http://vk.com/dev/photos.putTag
        return Vk.query("photos.putTag", params);
    }


    public static String removeTag(String params) {
        // http://vk.com/dev/photos.removeTag
        return Vk.query("photos.removeTag", params);
    }


    public static String getNewTags(String params) {
        // http://vk.com/dev/photos.getNewTags
        return Vk.query("photos.getNewTags", params);
    }
}
