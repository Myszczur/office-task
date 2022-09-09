import {NgModule} from '@angular/core';
import {RouterModule, Routes} from '@angular/router';
import {GuideListComponent} from "./guide-list/guide-list.component";
import {CreateGuideComponent} from "./create-guide/create-guide.component";
import {UpdateGuideComponent} from "./update-guide/update-guide.component";

const routes: Routes = [
  {path: 'guide', component: GuideListComponent},
  {path: 'create-guide', component: CreateGuideComponent},
  {path: 'update-guide/:id', component: UpdateGuideComponent},
  {path: '', redirectTo: 'guide', pathMatch: 'full'}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule {
}
