/*
 *                 Twidere - Twitter client for Android
 *
 *  Copyright (C) 2012-2015 Mariotaku Lee <mariotaku.lee@gmail.com>
 *
 *  This program is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation, either version 3 of the License, or
 *  (at your option) any later version.
 *
 *  This program is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 *
 *  You should have received a copy of the GNU General Public License
 *  along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package org.mariotaku.twidere.api.twitter.api;

import org.mariotaku.twidere.api.twitter.TwitterException;
import org.mariotaku.twidere.api.twitter.model.User;

/**
 * @author Joern Huxhorn - jhuxhorn at googlemail.com
 */
@SuppressWarnings("RedundantThrows")
public interface SpamReportingResources {

	/**
	 * The user specified in the id is blocked by the authenticated user and
	 * reported as a spammer. <br>
	 * This method calls http://api.twitter.com/1.1/report_spam.json
	 * 
	 * @param userId The ID of the user you want to report as a spammer.
	 * @return The User reported as a spammer.
	 * @throws TwitterException when Twitter service or network is unavailable
	 * @see <a href="https://dev.twitter.com/docs/api/1.1/post/report_spam">POST
	 *      report_spam | Twitter Developers</a>
	 * @since Twitter4J 2.1.0
	 */
	User reportSpam(long userId) throws TwitterException;

	/**
	 * The user specified in the id is blocked by the authenticated user and
	 * reported as a spammer. <br>
	 * This method calls http://api.twitter.com/1.1/report_spam.json
	 * 
	 * @param screenName The screen name of the user you want to report as a
	 *            spammer.
	 * @return The User reported as a spammer.
	 * @throws TwitterException when Twitter service or network is unavailable
	 * @see <a href="https://dev.twitter.com/docs/api/1.1/post/report_spam">POST
	 *      report_spam | Twitter Developers</a>
	 * @since Twitter4J 2.1.0
	 */
	User reportSpam(String screenName) throws TwitterException;
}