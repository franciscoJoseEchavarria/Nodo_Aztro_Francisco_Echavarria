import { ComponentFixture, TestBed } from '@angular/core/testing';

import { NostrosComponent } from './nostros.component';

describe('NostrosComponent', () => {
  let component: NostrosComponent;
  let fixture: ComponentFixture<NostrosComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [NostrosComponent]
    })
    .compileComponents();

    fixture = TestBed.createComponent(NostrosComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
