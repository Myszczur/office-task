import {Component, OnInit} from '@angular/core';
import {Guide} from "../guide";
import {GuideService} from "../guide.service";
import {Router} from "@angular/router";

@Component({
  selector: 'app-guide-list',
  templateUrl: './guide-list.component.html',
  styleUrls: ['./guide-list.component.css']
})
export class GuideListComponent implements OnInit {

  guides: Guide[] | undefined;

  constructor(private guideService: GuideService,
              private router: Router) {
  }

  ngOnInit(): void {
    this.getGuides();
  }

  private getGuides() {
    this.guideService.getGuidesList().subscribe(data => {
      console.log(data);
      this.guides = data;
    });
  }

  updateGuide(id: number) {
    this.router.navigate(['update-guide', id]);
  }
}

