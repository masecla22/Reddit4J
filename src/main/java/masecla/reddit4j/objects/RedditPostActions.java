package masecla.reddit4j.objects;

import java.io.IOException;

public interface RedditPostActions {
    void upvote() throws IOException, InterruptedException;
    void downvote() throws IOException, InterruptedException;

    /**
     * Delete a Link or Comment.
     *
     * /api/del
     */
    void delete() throws IOException, InterruptedException;

    //default void edit() {};

    /**
     * Submit a new comment or reply to a message.
     *
     * parent is the fullname of the thing being replied to. Its value changes the kind of object created by this request:
     *
     * the fullname of a Link: a top-level comment in that Link's thread. (requires submit scope)
     * the fullname of a Comment: a comment reply to that comment. (requires submit scope)
     * the fullname of a Message: a message reply to that message. (requires privatemessages scope)
     * text should be the raw markdown body of the comment or message.
     */
    //default void reply() {};

    /**
     * Hide a link.
     * This removes it from the user's default view of subreddit listings.
     * @see #unhide()
     */
    void hide() throws IOException, InterruptedException;

    /**
     * Unhide a link.
     * @see #hide()
     */
    void unhide() throws IOException, InterruptedException;

    //default void remove() {};
    //default void approve() {};
    //default void distinguish() {};

    /**
     * Unlock a link or comment.
     *
     * Allow a post or comment to receive new comments.
     *
     * See also: /api/lock.
     */
    void lock() throws IOException, InterruptedException;

    /**
     * Unlock a link or comment.
     *
     * Allow a post or comment to receive new comments.
     *
     * See also: /api/lock.
     */
    void unlock() throws IOException, InterruptedException;


    /**
     * Mark a link NSFW.
     *
     * See also: /api/unmarknsfw.
     */
    void marknsfw() throws IOException, InterruptedException;

    /**
     * Remove the NSFW marking from a link.
     *
     * See also: /api/marknsfw.
     */
    void unmarknsfw() throws IOException, InterruptedException;

    /**
     * Save a link or comment.
     *
     * Saved things are kept in the user's saved listing for later perusal.
     *
     * See also: /api/unsave.
     */
    void save(String category) throws IOException, InterruptedException;

    /**
     * Unsave a link or comment.
     *
     * This removes the thing from the user's saved listings as well.
     *
     * See also: /api/save.
     */
    void unsave() throws IOException, InterruptedException;


    void spoiler() throws IOException, InterruptedException;
    void unspoiler() throws IOException, InterruptedException;

    /**
     * Report a link, comment or message. Reporting a thing brings it to the attention of the subreddit's moderators. Reporting a message sends it to a system for admin review. For links and comments, the thing is implicitly hidden as well (see /api/hide for details).
     * See /r/{subreddit}/about/rules for more about subreddit rules, and /r/{subreddit}/about for more about free_form_reports.
     */
    //default void report() {};
}
