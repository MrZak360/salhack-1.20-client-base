package me.ionar.salhack.gui.click.component.item;

import me.ionar.salhack.font.FontRenderers;
import me.ionar.salhack.gui.click.component.listeners.ComponentItemListener;
import me.ionar.salhack.gui.hud.HudComponentItem;

public class ComponentItemHUD extends ComponentItem
{
    final HudComponentItem Mod;

    public ComponentItemHUD(HudComponentItem p_Mod, String p_DisplayText, String p_Description, int p_Flags, int p_State, ComponentItemListener p_Listener, float p_Width, float p_Height)
    {
        super(p_DisplayText, p_Description, p_Flags, p_State, p_Listener, p_Width, p_Height);
        Mod = p_Mod;
    }

    @Override
    public String GetDisplayText()
    {
        String l_DisplayText = Mod.GetDisplayName();

        float l_Width = FontRenderers.getTwCenMtStd22().getStringWidth(l_DisplayText);

        while (l_Width > GetWidth())
        {
            l_Width = FontRenderers.getTwCenMtStd22().getStringWidth(l_DisplayText);
            l_DisplayText = l_DisplayText.substring(0, l_DisplayText.length()-1);
        }

        return l_DisplayText;
    }

    @Override
    public String GetDescription()
    {
        return "";
    }

    @Override
    public void Update()
    {
    }

    @Override
    public boolean HasState(int p_State)
    {
        if ((p_State & ComponentItem.Clicked) != 0)
            return !Mod.IsHidden();

        return super.HasState(p_State);
    }
}
