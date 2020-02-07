// Copyright 2020 Sebastian Kuerten
//
// This file is part of melon-commons-io.
//
// melon-commons-io is free software: you can redistribute it and/or modify
// it under the terms of the GNU Lesser General Public License as published by
// the Free Software Foundation, either version 3 of the License, or
// (at your option) any later version.
//
// melon-commons-io is distributed in the hope that it will be useful,
// but WITHOUT ANY WARRANTY; without even the implied warranty of
// MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
// GNU Lesser General Public License for more details.
//
// You should have received a copy of the GNU Lesser General Public License
// along with melon-commons-io. If not, see <http://www.gnu.org/licenses/>.

package de.topobyte.melon.commons.io;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

import org.apache.commons.io.IOUtils;

public class Resources
{

	/**
	 * Load a resource to a string using
	 * {@link IOUtils#toString(InputStream, Charset)}.
	 * 
	 * @param filename
	 *            the file to load from the classpath
	 * @return a string, decoded as UTF8
	 * @throws IOException
	 */
	public static String loadString(String filename) throws IOException
	{
		try (InputStream is = Thread.currentThread().getContextClassLoader()
				.getResourceAsStream(filename)) {
			return IOUtils.toString(is, StandardCharsets.UTF_8);
		}
	}

	/**
	 * Load a resource to a string using
	 * {@link IOUtils#toByteArray(InputStream)}.
	 * 
	 * @param filename
	 *            the file to load from the classpath
	 * @return a byte array
	 * @throws IOException
	 */
	public static byte[] loadBytes(String filename) throws IOException
	{
		try (InputStream is = Thread.currentThread().getContextClassLoader()
				.getResourceAsStream(filename)) {
			return IOUtils.toByteArray(is);
		}
	}

}
