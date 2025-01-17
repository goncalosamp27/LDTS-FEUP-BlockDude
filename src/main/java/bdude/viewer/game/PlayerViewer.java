package bdude.viewer.game;

import bdude.gui.GUI;
import bdude.model.game.elements.Player;

public class PlayerViewer implements ElementViewer<Player>{
    @Override
    public void draw (Player player, GUI gui){
        if(player.getDirection() && !player.getPowerActive()) gui.drawPlayer(player.getPosition());
        if (!player.getDirection() && !player.getPowerActive()) gui.drawPlayer2(player.getPosition());

        if (player.getDirection() && player.getPowerActive()) gui.drawPlayerPower (player.getPosition());
        if (!player.getDirection() && player.getPowerActive()) gui.drawPlayerPower2 (player.getPosition());

        if(player.getHoldingBlock()){
            gui.drawHoldingBlock(player.getPosition().getUp());
        }
    }
}
