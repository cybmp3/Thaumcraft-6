/*    */ package thaumcraft.client.renderers.models;
/*    */ 
/*    */ import net.minecraft.client.model.ModelBase;
/*    */ import net.minecraft.client.model.ModelRenderer;
/*    */ 
/*    */ 
/*    */ 
/*    */ public class ModelCube
/*    */   extends ModelBase
/*    */ {
/*    */   ModelRenderer cube;
/*    */   
/*    */   public ModelCube() {
/* 14 */     this.field_78090_t = 64;
/* 15 */     this.field_78089_u = 32;
/*    */     
/* 17 */     this.cube = new ModelRenderer(this, 0, 0);
/* 18 */     this.cube.func_78789_a(-8.0F, -8.0F, -8.0F, 16, 16, 16);
/* 19 */     this.cube.func_78793_a(8.0F, 8.0F, 8.0F);
/* 20 */     this.cube.func_78787_b(64, 32);
/* 21 */     this.cube.field_78809_i = true;
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public ModelCube(int shift) {
/* 27 */     this.field_78090_t = 64;
/* 28 */     this.field_78089_u = 64;
/*    */     
/* 30 */     this.cube = new ModelRenderer(this, 0, shift);
/* 31 */     this.cube.func_78789_a(-8.0F, -8.0F, -8.0F, 16, 16, 16);
/* 32 */     this.cube.func_78793_a(0.0F, 0.0F, 0.0F);
/* 33 */     this.cube.func_78787_b(64, 64);
/* 34 */     this.cube.field_78809_i = true;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/* 41 */   public void render() { this.cube.func_78785_a(0.0625F); }
/*    */ 
/*    */ 
/*    */   
/*    */   public void setRotation(ModelRenderer model, float x, float y, float z) {
/* 46 */     model.field_78795_f = x;
/* 47 */     model.field_78796_g = y;
/* 48 */     model.field_78808_h = z;
/*    */   }
/*    */ }


/* Location:              D:\工程开发\Cracked\Thaumcraft-1.12.2-6.1.BETA26.jar!\thaumcraft\client\renderers\models\ModelCube.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.0.7
 */