import {Component, OnInit} from '@angular/core';
import {GuideService} from "../guide.service";
import {Guide} from "../guide";
import {ActivatedRoute, Router, Routes} from "@angular/router";
import {error} from "@angular/compiler-cli/src/transformers/util";

@Component({
  selector: 'app-update-guide',
  templateUrl: './update-guide.component.html',
  styleUrls: ['./update-guide.component.css']
})
export class UpdateGuideComponent implements OnInit {

  id: number | undefined;
  guide: Guide | undefined;

  constructor(private guideService: GuideService,
              private routes: ActivatedRoute, private router: Router) {
  }

  ngOnInit(): void {
    this.guide = new Guide();
    this.id = this.routes.snapshot.params['id'];

    this.guideService.getGuideById(this.id).subscribe(data => {
      this.guide = data;
    }, error => console.log(error));
  }

  updateGuide() {
    this.guideService.updateGuide(this.id, this.guide).subscribe(data => {
      this.guide = new Guide();
      this.goToGuideList();
    }, error => console.log(error));
  }

  onSubmit() {
    this.guideService.updateGuide(this.id, this.guide).subscribe(data => {
      this.goToGuideList();
    }, error => console.log(error));
  }

  goToGuideList() {
    this.router.navigate(['/guide']);
  }

}
