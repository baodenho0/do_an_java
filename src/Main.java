/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import GUI.FormDangnhap;
import Controllers.DangNhapController;
/**
 *
 * @author lenovo
 */
public class Main {
    public static void main(String[] args){
        DangNhapController dangNhapController = new DangNhapController();
        FormDangnhap formDangnhap = new FormDangnhap(dangNhapController);
        formDangnhap.getForm();
    }
}
