package soot.jbco.name;

/*-
 * #%L
 * Soot - a J*va Optimization Framework
 * %%
 * Copyright (C) 1997 - 2018 Raja Vallée-Rai and others
 * %%
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation, either version 2.1 of the
 * License, or (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Lesser Public License for more details.
 * 
 * You should have received a copy of the GNU General Lesser Public
 * License along with this program.  If not, see
 * <http://www.gnu.org/licenses/lgpl-2.1.html>.
 * #L%
 */

/**
 * Implementation that generates names consisting of hard recognizable symbols.
 *
 * @author p.nesterovich
 * @since 21.03.18
 */
public class HorrorNameGenerator extends AbstractNameGenerator implements NameGenerator {

  private static final char stringChars[][] = { { 'S', '5', '$' }, // latin s, five, dollar sign
      { 'l', '1', 'I', '�' }, // l, one, I, greek iota
      { '0', 'O', '�', '�', '�' }, // zero, english O, russian O, greek omicron, armenian Օ
      { 'o', '�', '�' }, // english o, russian o and greek omicron
      { 'T', '�', '�' }, // english T, russian T, greek tau
      { 'H', '�', '�' }, // english, russian, greek
      { 'E', '�', '�' }, // english, russian, greek
      { 'P', '�', '�' }, // english, russian, greek
      { 'B', '�', '�' }, // english, russian, greek
      { '_' } };

  @Override
  protected char[][] getChars() {
    return stringChars;
  }

}
