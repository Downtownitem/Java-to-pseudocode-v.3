package Custom.PanelTagComponent;

import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;

public interface EventTags {

    public void onAddItem(Item item, String text);

    public void onKeyType(Item item, String text, KeyEvent evt);

    public void onItemRemove(Item item, String text);

    public boolean isRemoveAble(Item item, String text);

    public boolean isAddAble(Item item, String text);

    public void onEdit(Item item, String text);

    public void itemOnClick(Item item, String text, MouseEvent evt);

    public void itemOnEntered(Item item, String text, MouseEvent evt);

    public void itemOnExited(Item item, String text, MouseEvent evt);

    public void itemOnPressed(Item item, String text, MouseEvent evt);

    public void itemOnReleased(Item item, String text, MouseEvent evt);

}
