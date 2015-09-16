/*
 * This file is part of WebLookAndFeel library.
 *
 * WebLookAndFeel library is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * WebLookAndFeel library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with WebLookAndFeel library.  If not, see <http://www.gnu.org/licenses/>.
 */

package com.alee.demo.ui.examples;

import com.alee.laf.tree.WebTreeCellRenderer;
import com.alee.laf.tree.WebTreeElement;

import javax.swing.*;

/**
 * @author Mikle Garin
 */

public class ExamplesTreeCellRenderer extends WebTreeCellRenderer
{
    @Override
    public WebTreeElement getTreeCellRendererComponent ( final JTree tree, final Object value, final boolean isSelected,
                                                         final boolean expanded, final boolean leaf, final int row, final boolean hasFocus )
    {
        final ExamplesTreeNode node = ( ExamplesTreeNode ) value;
        final WebTreeElement renderer = super.getTreeCellRendererComponent ( tree, value, isSelected, expanded, leaf, row, hasFocus );
        renderer.setIcon ( node.getIcon () );
        renderer.setText ( node.toString () );
        return renderer;
    }
}