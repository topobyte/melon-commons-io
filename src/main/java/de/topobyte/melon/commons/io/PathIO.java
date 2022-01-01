// Copyright 2022 Sebastian Kuerten
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
import java.nio.file.Files;
import java.nio.file.Path;

import org.apache.commons.io.IOUtils;

public class PathIO
{

	/**
	 * Gets the contents of a <code>Path</code> as a String using UTF-8
	 * character encoding.
	 *
	 * @param file
	 *            the <code>Path</code> to read from
	 * @return the requested String
	 * @throws NullPointerException
	 *             if the input is null
	 * @throws IOException
	 *             if an I/O error occurs
	 */
	public String toString(Path file) throws IOException
	{
		return toString(file, StandardCharsets.UTF_8);
	}

	/**
	 * Gets the contents of a <code>Path</code> as a String using the specified
	 * character encoding.
	 *
	 * @param file
	 *            the <code>Path</code> to read from
	 * @param encoding
	 *            the encoding to use, null means platform default
	 * @return the requested String
	 * @throws NullPointerException
	 *             if the input is null
	 * @throws IOException
	 *             if an I/O error occurs
	 */
	public String toString(Path file, Charset charset) throws IOException
	{
		try (InputStream is = Files.newInputStream(file)) {
			return IOUtils.toString(is, charset);
		}
	}

}
