package test;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Random;

import javax.imageio.ImageIO;

/**
 * 验证码生成
 * @author soft01
 *
 */
public class RandomImage {
	public static void main(String[] args) throws FileNotFoundException, IOException {
		char[] chars = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789".toCharArray();
		
		//创建画布
		BufferedImage image = new BufferedImage(65, 35, BufferedImage.TYPE_INT_RGB);
		//获取对这张图的画笔，用于往这张图上画内容
		Graphics g = image.getGraphics();
		
		//创建一个颜色
		Color color = new Color(213,255,11);
		//设置画笔为这个颜色
		g.setColor(Color.LIGHT_GRAY);
		
		//使用画笔填充一个矩形，颜色为当前画笔指定颜色
		g.fillRect(0, 0, 65, 35);
		
		Random ran = new Random();
		
		g.setFont(new Font("Default", Font.BOLD, 20));
		for(int i=0;i<4;i++) {
			g.setColor(new Color(ran.nextInt(100),ran.nextInt(180),ran.nextInt(160)));
			g.drawString(chars[ran.nextInt(chars.length)]+"", i*15+5, i*(-2)+22);
		}
			
		for(int i=0;i<6;i++) {
			g.setColor(new Color(ran.nextInt(100),ran.nextInt(180),ran.nextInt(160)));
			g.drawLine(ran.nextInt(65), ran.nextInt(35), ran.nextInt(65), ran.nextInt(35));
		}
		
		
		ImageIO.write(image, "jpg", new FileOutputStream("image.jpg"));
		System.out.println("图片生成完毕！");
		
		
	}
}
