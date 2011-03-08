/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package net.jps.atom.hopper.adapter;

import net.jps.atom.hopper.adapter.request.DeleteEntryRequest;
import net.jps.atom.hopper.adapter.request.PostEntryRequest;
import net.jps.atom.hopper.adapter.request.PutEntryRequest;
import net.jps.atom.hopper.response.AdapterResponse;
import net.jps.atom.hopper.response.EmptyBody;
import org.apache.abdera.model.Entry;

/**
 *
 * @author zinic
 */
public interface FeedPublisher {

    /**
     * Requests a single entry be added to the feed.
     *
     * @param request
     *
     * @param entryToAdd
     *
     * @return
     * The returned entry should contain all of the information a client would
     * need to then request the newly added entry.
     */
    AdapterResponse<Entry> postEntry(PostEntryRequest postEntryRequest);

    /**
     * Requests that an entry be updated. This request is scoped by the unique
     * string ID of the entry the update is being requested for.
     *
     * @param request
     *
     * @return
     * The returned entry should contain all updated information including:
     * hrefs, datestamps and content.
     */
    AdapterResponse<Entry> putEntry(PutEntryRequest putEntryRequest);

    /**
     * Requests that an entry be deleted. This request is scoped by the unique
     * string ID of the entry the delete is being requested for.
     *
     * @param request
     *
     * @return
     */
    AdapterResponse<EmptyBody> deleteEntry(DeleteEntryRequest deleteEntryRequest);
}