import { provideRouter, Routes } from '@angular/router';
import { InicioComponent } from './pages/inicio/inicio.component';
import { NostrosComponent } from './pages/nosotros/nostros.component';
import { TiendasComponent } from './pages/tiendas/tiendas.component';
import { ApplicationConfig } from '@angular/core';
import { NotFoundComponent } from './pages/not-found/not-found.component';

export const routes: Routes = [
    
    {path: '', component: InicioComponent},
    {path: 'inicio', component: InicioComponent},
    {path: 'nosotros', component: NostrosComponent},
    {path: 'tienda', component: TiendasComponent},
    {path: '**', component: NotFoundComponent}
    
];
